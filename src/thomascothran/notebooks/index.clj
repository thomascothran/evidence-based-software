{:nextjournal.clerk/visibility {:code :hide}}
(ns thomascothran.notebooks.index
  (:require [nextjournal.clerk :as c]))

(c/md "

# Evidence Based Software Development

🚧 _This book is under heavy development. Chapters will be made available as they are completed_ 🚧

Traditional approaches to software development fail in at least one of the following respects:

First, the economic justification for initiatives may be entirely lacking, or at least hidden those whose many decisions are required to achieve those goals.

Second, the business case may have been provided, but it ignores risk entirely and so is an aspiration. Rather than dealing in probabilities, it peddles false certainties.

Third, software development methodologies may only manage the big picture (waterfall) or the minutia (the no estimates). They may provide tactics, or strategies, but they cannot connect the two.

🤔 Ask yourself:

- Do you know within a reasonable range what the difference in profits may be as a result of your project?
- Do you know what the major risks threaten your project's achievement its economic goals? Do you know the relative magnitude of these risks in terms of economic impact?
- Are you able to successfully give an estimate of the duration of the initiatives you work on, from planning to the successful delivery of features to your users?
- Once a project is underway, do you forecast when it will be complete?
- As a project moves forward, do you make economically informed adjustments to timeline, scope, or capacity?

## 📖 Chapter Structure

Rather than appeal to manifestos or commercialized 'best practices', our foundation will be the well-established principles of micro-economics, queuing theory, decision theory, and risk management.

We will balance the theoretical discussion with the narratives of a company, SoftCo, as they use these principles to solve concrete, relatable problems.


Each chapter will have the following structure:

1. A clear problem statement will clarify what we aim to address in the chapter
2. A list of the prerequisites will convey the previous knowledge the reader must have. Usually, this will be from another chapter in this book.
3. A narrative example of the problem, as our fictional company SoftCo experiences it
4. An explanation of the solution, along with its core principles
5. A narrative of how SoftCo applied the solution

This should allow you, as the reader, to skip sections you already understand, and jump around to the parts that interest you. Use this like a handbook, not a treatise.

I hope you find this book useful and enlightening, and we look forward to hearing about your successes in applying these ideas in your own work.

## Influences

Most of the foundations for this work have been laid by Donald Reinertsen, Douglas Hubbard, David Anderson, and Daniel Vacanti.

The book was directly inspired by Donald Reinertsen's comment that he wished someone would write a more accessible version of his *Principles of Product Development Flow*.

## Table of Contents

### Section 1: turning on the lights

This section will deal with getting a handle on work that is in flight. It addresses those situations where there is a flurry of development, but difficulty in delivering it.

[**The big picture: the value stream**](./value_stream.clj) 🚧 How can we understand our system as a whole, from the business ask all the way through to delivery and support

[**Lead and Cycle Times**](./lead_and_cycle_times.clj) 🚧 How long does it take us to finish things? Where does work get stuck along the way?

[**Throughput**](./throughput.clj). 🚧 How much can we do?

[**Item Aging**](./item_aging.clj) 🚧 How can I identify problem work items? In what ways can variability be reduced? What is a leading indicator that we are starting more work than we finish?

[**Work in Progress**](./wip.clj) 🚧 How can we identify when we have taken on too much work? What metric allows us to ensure we finish work before starting new work?

[**Visualizing flow metrics**](./visualizing_flow_metrics.clj) 🚧 We understand and visualize our value stream, and we understand our flow metrics. How do we visualize them together? How do we quantify them?

### Section 2: introducing the economics of software development flow

If the previous section gives us an understanding of doing and delivering work, this section gives us an understanding of what work is worth doing.

Our purpose in this section is to understand value and economic terms in general, and economic model in particular, and the role of information, probability, and uncertainty with respect to making rational decisions about software

[**The Economic Model**](./economic_model.clj) 🚧 How do we think in an economic model about software development in general? What is Donald reinertson's economic model, and how can we apply it in our context? What difference does it make?

[**Cost of Delay**](./cost_of_delay.clj) 🚧 What is the Cost of Delay, and how does it unlock our decisions?

[**Modeling uncertainty**](./modeling_uncertainty.clj) 🚧 All of our economic plans involve uncertainty and risk. How can we make decisions without certainty?

[**The Value of Information**](./value_of_information.clj) 🚧 How do we identify the metrics that really matter? Using the expected value of information and the expected cost of information. Use Douglas Hubbard's techniques

[**Decision Theory**](./decision_theory.clj) 🚧 Problem: how can we put together what we learned about the economic model, the cost and value of information, and use decision theory. To assess how to make decisions

### Section 3: planning and execution

This section is primarily about planning at the initiative level and executing on those plans.

This section applies what we learned about metrics, and the economics of software development to analyze how we can improve our process of producing software. We have on the one hand the data, that is to say metrics and financial data, and we have the theory including reinertson's economic model, Hubbard's applied information economics, and probability theory

[**The High Cost of Detailed Planning**](./high_cost_of_planning.clj) 🚧 Problem: how can we avoid doing planning in a way that limits our options? What can options theory tell us about how costly advanced planning is?

[**Planning and Prioritizing Initiatives**](./planning_and_prioritizing_initiatives.clj) 🚧 What alternatives do we have to the waterfall model where we specify everything in a feature up front, and then try to hit a deadline? We will use Monte Carlo simulations and reference class forecasting to use historical data to T-shirt size projects

[**T-Shirt Sizing**](./t_shirt_sizing.clj) 🚧 How can we get an approximate T-shirt size for a new initiative?

[**Prioritizing Initiatives**](./economic_prioritization.clj) 🚧

[**Continuous Forecasting with Monte Carlo**](./continuous_forecasting.clj) 🚧 Once a project is underway, how do we project when it will be complete?

[**The Cost of Large Batches**](./cost_of_large_batches.clj) 🚧 What are the economic costs of batches and how can we do better? How do small batches give us better economics? How do we size deliverables in an economically rational way?

[**Queues vs Timelines**](./queues_vs_timelines.clj) 🚧 What is the economic cost of queues, what do they look like in practice, and why did Reinertsen say it is better to manage ques than timelines?

### Section 4: improving the process

In this section, we are reflecting not on a particular feature, but on our process of delivering features. How can we quantitatively and economically model our process, and identify the areas for improvement?

[**Bayes Theorem**](./bayes_theorem.clj) 🚧 how can you collect, evaluate, and make intelligent decisions based on your own data? Sampling and the use of Bayes theorem.

[**What work items to work on?**](./what_work_items_to_work_on.clj) 🚧 How do we manage what work items to start? Work items are smaller than the initiative level, these are stories.

[**Predictability**](./predictability.clj) 🚧 how can we improve our predictability, and reduce our variability, understanding that the reduction in variability must be made in an economically informed way.

[**Process Modelling with Monte Carlo**](./monte_carlo_process_modeling.clj) 🚧 how can we use Monte Carlo to model how work items flow through our value stream, and identify the areas which are most beneficial to optimize?

[**Process Modeling with Agent Based Models**](./agent_based_models.clj) 🚧  how can we use agent based models to simulate how work items flow through our value stream, and identify the areas that are most beneficial to optimize?
")
