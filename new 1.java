This paper presents a solution approach for the truck planning of multi-modal container transport with time windows, applied  to the case of H\&S Foodtrans.
Multi-modal container transport refers to the transportation of containers under a single agreement, with multiple different forms of transportation (\cite{Steadie}).
At H\&S Foodtrans special containers, also referred to as tanktainers, carrying liquid food are transported by trucks, train and/or ferry throughout Europe.
Trucks either carry tanktainers to terminals, where these will proceed by train or ferry, or directly drive the containers to their final destination, the latter addressed to as unimodal transportation.
The transportation by truck, also called drayage operations, composes a considerably large part of total costs of intermodal transport (\cite{Zhang2}).
Therefore, efficient planning of these operations is an important task.\\

The H\&S Foodtrans container and truck planning problem contains several better-known sub problems.
Related literature is therefore obtained to break down the problem and obtain insights on how the sub problems are to be tackled.  
As truck scheduling with time windows is not a new problem and has been studied since 1980 (among others \cite{Psaraftis}), various methods to solve similar problems have been formulated. 
\cite{Bent} have looked into large problem instances containing up to 600 orders and solved them using a two-stage hybrid algorithm, where \cite{Braeker2} have looked into integrated planning of drayage.
A bi-objective vehicle routing problem in drayage operations has been studied by \cite{Braeker1}.
An optimal solution approach to solve origin-destination integer commodity flow problems was presented by \cite{Barnhart}.
As the case given by Ab Ovo has some additional constraints compared to problems that have previously been studied, a combination of algorithms are used to solve this case. 

The algorithm can be broken down into four different categories:
\begin{itemize}
    \item Initial solution heuristic;
    \item Meta-heuristic;
    \item Local search;
    \item Feasibility and cost calculation.
\end{itemize}

First, a problem description and problem formulation is given in Sections \ref{section:problemdescription} and \ref{section:problemformulation}. 
Two initial solution approaches, one of which is inspired by a nearest neighbour heuristic, are described in Section \ref{sec:initial}. 
For the meta-heuristic the idea of a Simulated Annealing (SA) algorithm exploring a large neighborhood from \cite{Bent} is used, as this approach was applied on a large instance where other papers did not report results for large instances.
The SA algorithm is described in Section \ref{sec:SA}. 
The local search operators, consisting of multiple types of swaps to the current solution, are described in Section \ref{sec:localsearch}.
The results of this case study are given in Section \ref{section:results}.
Finally, a discussion and conclusion follows in Sections \ref{section:discussion} and \ref{section:conclusion} and future research suggestions are given in Section \ref{section:extension}.

VOORMALIG PROBLEM DESCRIPTION!!!

Although we can generalize the methods in this study to other real-world vehicle routing systems, this case study focuses on the example of H\&S Foodtrans to illustrate the practical aspect of the solution approach framework.
H\&S Foodtrans transports liquid food in tanktainers carried by trucks, in a business to business setting.
Apart from the fleet of trucks available at the company itself, trucks could also be chartered at higher costs.
The objective is to create an optimized truck planning with minimal costs, such that a feasible tanktainer circulation exists and all orders and terminal connections are met.
Optimizing terminal connections is out of scope of this research. 

The problem involves unimodal as well as intermodal transportation of tanktainers.
Trains and ferries transport loaded as well as empty tanktainers throughout Europe.
Each order has its own time window and location for pick-up and delivery.
Each tanktainer first needs to be cleaned before it is loaded with a new order.
At these cleaning facilities, the possibility exists to dismount the tanktainer and let it be picked up by another truck after it is being cleaned.
Each truck has the option to drive to its home location in case the schedule allows to do so at all times.
At these home locations, there are no costs involved. 




