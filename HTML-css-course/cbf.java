function ThreeSum(arr) {
  const target = arr[0];
  const nums = arr.slice(1).sort((a, b) => a - b); // Fix comparison here

  for (let i = 0; i < nums.length - 2; i++) {
    let left = i + 1;
    let right = nums.length - 1;

    while (left < right) {
      const sum = nums[i] + nums[left] + nums[right];

      if (sum === target) {
        return "true";
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }
  }

  return "false";
}

// keep this function call here
console.log(ThreeSum(readline()));
