def nearest_cell(arr, p1 ,p2):
    n = len(arr)
    def djikstra(arr, start):
        dp = [float('inf') for _ in range(n)]
        dp[start] = 0
        q = [(0, start)]
        visit = set()
        while q:
            cost, node = q.pop(0)
            if node in visit: continue
            dp[node] = cost
            visit.add(node)
            if arr[node] == -1: continue
            q.append((cost+1, arr[node]))
        return dp
    
    d1 = djikstra(arr,p1)
    d2 = djikstra(arr, p2)

    d= [float('inf') for _ in range(n)]
    for i in range(n):
        tmp = d1[i] + d2[i]
        d[i] = tmp
    return min( list(range(i)), key = lambda x: (d[x], x))
    
N = int(input().strip())
edges = list(map(int, input().strip().split()))
C1, C2 = map(int, input().strip().split())
print(nearest_meeting_cell(N, edges, C1, C2)) 
    
    
"""arr=[4,4,1,4,13,8,8,8,0,8,14,9,15,11,-1,10,15,22,22,22,22,22,21];
a=9;
b=2;
res= nearest_cell(arr,a,b);
print(res);"""

