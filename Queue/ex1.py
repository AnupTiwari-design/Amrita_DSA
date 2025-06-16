
from queue import Queue

# Array of elements
arr = [10, 20, 30, 40, 50]

# Create a queue
q = Queue()

for item in arr:
    q.put(item)

#check Queue is empty

print("Is queue empty?", q.empty())

#check size

print(q.qsize())


print("Front element (without removing):")
temp_q = Queue()
if not q.empty():
    front = q.get()
    print(front)
    temp_q.put(front)

while not q.empty():
    temp_q.put(q.get())
    
q = temp_q


print("Elements in queue:")
while not q.empty():
    print(q.get(), end=" ")



