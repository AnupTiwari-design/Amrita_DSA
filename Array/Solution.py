def move_zeroes(nums):
    count = 0
    for i in range(len(nums)):
        if nums[i] == 0:
            count += 1
        elif count > 0:
            nums[i - count] = nums[i]
            nums[i] = 0