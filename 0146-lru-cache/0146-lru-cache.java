class LRUCache {
    int[] keys;
    int[] values;
    int capacity;
    int size;

    LRUCache(int capacity) {
        this.capacity = capacity;
        keys = new int[capacity];
        values = new int[capacity];
    }

    public int get(int key) {
        for (int i = 0; i < size; i++) {
            if (keys[i] == key) {
                int value = values[i];

                for (int j = i; j < size - 1; j++) {
                    keys[j] = keys[j + 1];
                    values[j] = values[j + 1];
                }

                keys[size - 1] = key;
                values[size - 1] = value;

                return value;
            }
        }
        return -1;
    }

    public void put(int key, int value) {
        for (int i = 0; i < size; i++) {
            if (keys[i] == key) {
                for (int j = i; j < size - 1; j++) {
                    keys[j] = keys[j + 1];
                    values[j] = values[j + 1];
                }

                keys[size - 1] = key;
                values[size - 1] = value;
                return;
            }
        }

        if (size == capacity) {
            for (int i = 0; i < size - 1; i++) {
                keys[i] = keys[i + 1];
                values[i] = values[i + 1];
            }
            size--;
        }

        keys[size] = key;
        values[size] = value;
        size++;
    }
}