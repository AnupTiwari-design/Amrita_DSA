def can_place_cows(stalls, cows, min_dist):
    count = 1
    last_pos = stalls[0]
    
    for i in range(1, len(stalls)):
        if stalls[i] - last_pos >= min_dist:
            count += 1
            last_pos = stalls[i]
        if count == cows:
            return True
    return False

def aggressive_cows(stalls, cows):
    stalls.sort()
    low = 1
    high = stalls[-1] - stalls[0]
    result = 0
    
    while low <= high:
        mid = (low + high) // 2
        if can_place_cows(stalls, cows, mid):
            result = mid
            low = mid + 1
        else:
            high = mid - 1
    
    return result

# Input
n, cows = map(int, input().split())
stalls = list(map(int, input().split()))

# Output
print(aggressive_cows(stalls, cows))