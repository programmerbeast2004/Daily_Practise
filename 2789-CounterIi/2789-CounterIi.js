// Last updated: 7/31/2025, 12:17:19 PM
function createCounter(initialValue = 0) {
  let count = initialValue;

  return {
    increment: () => {
      count++;
      return count;
    },
    decrement: () => {
      count--;
      return count;
    },
    reset: () => {
      count = initialValue;
      return count;
    },
    getValue: () => {
        return count;
    }
  };
}
