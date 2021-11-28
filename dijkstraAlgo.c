#include <limits.h>
#include <stdio.h>
#include <stdbool.h>

#define V 4

int minDistance(int dist[], bool sptSet[])
{	
	int min = INT_MAX, min_index;
	for (int v = 0; v < V; v++)
		if (sptSet[v] == false && dist[v] <= min)
			min = dist[v], min_index = v;

	return min_index;
}

void printSolution(int dist[])
{
    int h = 65;
    printf("Source vertex is: %c\n", h);
	printf("Vertex \t\t Distance from Source\n");
	for (int i = 0; i < V; i++){
        printf("%c \t\t %d\n", h++, dist[i]);
    }   	
        
}

void dijkstra(int graph[V][V], int src)
{
	int dist[V]; 
	bool sptSet[V]; 	
	for (int i = 0; i < V; i++)
		dist[i] = INT_MAX, sptSet[i] = false;
	
	dist[src] = 0;
	
	for (int count = 0; count < V - 1; count++) {		
		int u = minDistance(dist, sptSet);		
		sptSet[u] = true;		
		for (int v = 0; v < V; v++)			
			if (!sptSet[v] && graph[u][v] && dist[u] != INT_MAX
				&& dist[u] + graph[u][v] < dist[v])
				dist[v] = dist[u] + graph[u][v];
	}	
	printSolution(dist);
}

int main()
{
	
	int graph[V][V] = { { 0, 1, 2, 3 },
						{ 1, 0, 4, 5 },
						{ 2, 4, 0, 6 },
						{ 3, 5, 6, 0 }};

	dijkstra(graph, 0);

	return 0;
}
