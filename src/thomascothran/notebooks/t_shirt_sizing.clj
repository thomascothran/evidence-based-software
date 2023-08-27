{:nextjournal.clerk/visibility {:code :hide}}
(ns thomascothran.notebooks.t-shirt-sizing
  (:require [nextjournal.clerk :as c]))

(c/md "
# T Shirt Sizing with Reference Class Forecasting

In this section, we will discuss how to get a general estimation for how long a software initiative or feature might take that is both accurate and does not require too much effort. We want to know: is this a small, medium, or large project?
")

(c/md "
## The Problem Statement

When embarking on a new software development project, one of the most challenging tasks is accurately estimating the time and resources it will take to complete.

Traditional estimation methods often rely on expert intuition. For example, a product owner may write a summary of the features required, and then engineers review the summary and provide an estimate.

Or, to get a more accurate estimation, the product owner may write out the stories to be implemented. Engineers then work through the stories, providing estimates for each. The story estimates are summed, then a buffer added. This is the \"bottom up \" approach to estimation.

There are a family of related problems:

First, these methods are inaccurate. The process of estimation encourages a number of cognitive biases. Optimism bias, recency bias, group bias.

Second, engineers are often aware of the expected timeline. The process of estimation then turns into a process in which engineers convince themselves the work fits into that timeline.

Third, the method encourages precision over accuracy. \"I'll pick them up at tomorrow at 3:13 PM\" is very precise. It is unlikely to be accurate. By contrast, \"sometime between 3 and 3:30 PM\" is less precise, but likely much more accurate.

Fourth, the absence of confidence intervals. A confidence interval is the probability that the \"right answer\" falls in a given range. Estimation that gives a date has a 24 hour range. If a feature is promised 120 days from now, what is the probability that it will be delivered on that date? The confidence interval is very likely in single digits.

Fifth, the method is not evidence based. It is not based on clear assumptions that can be verified. And the evidence is that expert intuition is inferior to statistical methods for project planning.")

(c/md "
## Prerequisite Knowledge

We will keep the mathematics limited, but you should understand generally what a probability distribution is. ")

(c/md "

## Narrative Example

Alice and Ben are part of the project management team at SoftCo, a company that specializes in software development. They've been tasked with the planning and execution of a new project: the development of a mobile application. This is a significant undertaking for SoftCo, and the stakes are high. The mobile application is expected to be a major product offering, and its success could greatly influence the company's future.

Alice, a seasoned developer, is well aware of the complexities involved in such a project. She knows that developing a mobile application involves various stages, including design, coding, testing, and deployment. Each stage comes with its own set of challenges and uncertainties. She's concerned about the technical aspects of the project, such as choosing the right technology stack, ensuring the app's performance and security, and dealing with potential bugs and issues that might arise during development.

Ben, the project manager, has a different set of concerns. He's responsible for defining the project scope, scheduling tasks, allocating resources, and most importantly, estimating the project's cost and duration. He knows that accurate estimates are crucial for setting realistic expectations, securing the necessary budget, and keeping the project on track.

In the past, SoftCo has used traditional bottom-up estimation for their projects. This involves breaking down the project into individual tasks, estimating each task, and then adding up these estimates to get the total project estimate. However, this approach has often led to over-optimistic estimates. Projects frequently run over budget and behind schedule, causing stress for the team and dissatisfaction for stakeholders.

Ben and Alice remember a particularly challenging project from last year. The initial estimate was for six months of development time. However, unexpected technical issues, changes in requirements, and other unforeseen challenges caused the project to take nearly a year to complete. This led to budget overruns, strained relationships with stakeholders, and a lot of stress for the team.

Additionally, they are concerned about the amount of time engineers need to spend for accurate estimates. They want to avoid days of tedious meetings.

As they start planning for the mobile application project, Alice and Ben are determined to avoid the mistakes of the past. They want to find a better way to estimate the project's cost and duration, one that takes into account the inherent uncertainties and complexities of software development. They're looking for a solution that can provide more accurate and realistic estimates, helping them set better expectations, manage resources more effectively, and ultimately, ensure the success of the project.

After some research, Alice discovers Reference Class Forecasting. She proposes to Ben that they try it for this project.
")

(c/md "

## T-Shirt Sizing with Reference Class Forecasting

This is where Reference Class Forecasting (RCF) comes into play. RCF is a method that aims to improve the accuracy of predictions by reducing the impact of cognitive biases and leveraging statistical information from a relevant reference class of past projects.

The concept of Reference Class Forecasting (RCF) was first introduced by the Nobel laureate Daniel Kahneman and Amos Tversky in the late 1970s as part of their work on Prospect Theory, which describes how people make decisions involving risk and uncertainty. The idea was further developed by Kahneman in his collaboration with Bent Flyvbjerg, a Danish planning scholar, in the early 2000s. They applied the method to large-scale project planning, where it has been shown to significantly improve the accuracy of cost estimates and timelines.

### How Reference Class Forecasting Works

RCF involves three steps:

1. **Identify a relevant reference class:** A reference class is a group of past projects that are similar to the one you're planning. The key is to define \"similar\" in a way that's relevant to the factors that influence the project's duration and cost. In the context of software development, this could include factors like project size, complexity, team experience, and technology stack.

2. **Collect and analyze the distribution of outcomes in the reference class:** This involves gathering data on how long it took to complete the projects in your reference class and analyzing the distribution of these outcomes. This gives you a statistical picture of how similar projects have performed in the past.

3. **Use this distribution to forecast the outcome of your project:** Finally, you use this distribution to make a probabilistic forecast for your project. This might involve saying something like \"there's a 60% chance we'll finish within six months, and a 90% chance we'll finish within nine months.\"

### Why RCF is Better than Bottom Up Planning

Bottom up planning may seem more intuitively appealing, since it focuses more on the unique details of new projects. However, it is less accurate for several reasons.

1. **Cognitive Biases:** Even when projects are broken down into smaller pieces, estimates for each piece are often subject to cognitive biases. For example, the planning fallacy, identified by Kahneman and Tversky, is the tendency for individuals and teams to underestimate the time it will take to complete a task, even when they are aware of past experiences that suggest otherwise. This bias can lead to systematic underestimation in bottom-up forecasting.

2. **Aggregation of Uncertainty:** When you break a project down into many small pieces and then add up the estimates, the uncertainties associated with each piece also add up. This can lead to a larger overall uncertainty in the final estimate. Adding a buffer can help, but determining the right size of the buffer is challenging and often ends up being arbitrary.

3. **Neglect of Dependencies:** Bottom-up estimation often assumes that tasks are independent of each other, but in reality, tasks in a project often have complex dependencies. Delays or problems in one task can ripple through the project and cause delays in other tasks. RCF, on the other hand, takes into account the overall distribution of outcomes in similar projects, implicitly capturing these dependencies.

4. **Evidence from Research:** Research by Flyvbjerg and others has shown that RCF tends to produce more accurate forecasts than traditional methods, including bottom-up estimation. This is likely because RCF leverages a broader base of information (the reference class of similar projects) and reduces the impact of cognitive biases.

5. **Law of Large Numbers:** RCF leverages the law of large numbers, a principle from probability theory that states that as the number of trials increases, the average of the results gets closer to the expected value. By using a large reference class of projects, RCF averages out individual project variances and gets closer to the true expected outcome.

6. **Time Efficiency**. The value proposition of bottom up planning is that, the more attention is paid to the details, the more accurate an estimate is. Bottom up planning attempts to buy accuracy at the cost of time-intensive scrutiny. However, it is less accurate.

RCF provides a complementary approach that can help improve the accuracy of project forecasts by leveraging statistical analysis and reducing the impact of cognitive biases.
")

(c/md "
## Applying RCF

Let's explain RCF's three steps, and then we will illustrate them by returning to Alice and Ben.

")

(c/md "

### Establish a reference class

In the context of RCF, a reference class is a group of past projects that are similar to the project you're trying to forecast. The key is to identify a class that is broad enough to be statistically meaningful but narrow enough to be truly comparable to the new project.

In our example, let's say Alice is a developer and Ben is a project manager in a large corporation's software department. They're about to start a new project and want to use RCF to estimate its duration.

Alice and Ben start by looking at the department's past projects. They've been doing software projects for about 4 years, so they have a good amount of data to work with. However, they need to be careful to select a reference class that is truly comparable to their new project.

They consider several factors:

1. **Project Type:** Are the past projects similar to the new project in terms of their objectives, technologies used, and complexity? For example, if the new project involves developing a mobile app, they might want to look at past mobile app projects.

2. **Team Size:** The department has grown from about 10 to 20 developers over the last two or three years. Projects carried out by larger teams might have different dynamics than those carried out by smaller teams, so Alice and Ben might want to look at past projects that were carried out by a team of a similar size to their current team.

3. **Project Status:** A majority of the department's projects are not complete yet, but there are a couple that are. Alice and Ben might want to focus on the completed projects, as these provide a full picture of the project duration from start to finish.

After considering these factors, Alice and Ben decide to define their reference class as \"completed mobile app projects carried out by a team of 15-25 developers\". They believe this class is broad enough to provide a meaningful sample size, but narrow enough to be comparable to their new project.

This is the first step in RCF. The next steps will involve collecting data on the projects in the reference class, analyzing this data to create a probability distribution of outcomes, and then using this distribution to make a forecast for the new project.
")

(c/md "

### Find the Mean and Variability of the Reference Class

The second step in Reference Class Forecasting (RCF) is to collect data on the projects in the reference class and analyze the distribution of outcomes. This involves gathering data on how long each project took to complete, and then analyzing this data to understand its distribution.

In our example, let's say Alice and Ben have identified their reference class as \"all completed software projects carried out by a team of 10-30 developers\". They now need to collect data on these projects.

Alice might start by pulling data from the company's project management system. For each project in the reference class, she collects data on the planned duration (how long they thought the project would take at the outset) and the actual duration (how long the project actually took to complete).

Let's say they have data for 20 projects, and the actual durations (in days) are as follows:

")

^{::c/visibility {:code :hide :result :show}}
(def refclass1
  [30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125])


(c/md "

The next step is to analyze this data to understand its distribution. This involves calculating the mean (average), median (middle value), and mode (most common value), as well as measures of spread such as the range (maximum - minimum), variance, and standard deviation.

Alice, who has a background in statistics, takes on this task. She calculates the mean by adding up all the durations and dividing by the number of projects:

(30 + 35 + ... + 125) / 20 = 77.5 days

She calculates the standard deviation to get a measure of the spread of the durations. The standard deviation is the square root of the variance, which is the average of the squared differences from the mean.

After doing the calculations, she finds that the standard deviation is about 28.9 days. This means that most project durations are within 28.9 days of the mean (either shorter or longer).

With this analysis, Alice and Ben now have a good understanding of the distribution of outcomes in their reference class. They know that the average project takes about 77.5 days, but there's a fair amount of variation around this average.
")

(c/md "
# Appendix

## Why does bottom up estimation increase uncertainty?

When we estimate the duration of a project as a whole, we're often implicitly assuming that our estimate is a \"most likely\" scenario. We're assuming that everything will go as planned, with no unexpected delays or complications. This is why we tend to underestimate the total project duration: we're not fully accounting for the uncertainty in each task.

When we break a project down into tasks and estimate each task individually, we're acknowledging that there's some uncertainty in each task. But when we add up these estimates to get the total project duration, we're often implicitly assuming that these uncertainties will somehow cancel each other out—that if one task takes longer than expected, another task will take less time than expected.

But in reality, this is not what usually happens. More often, uncertainties tend to accumulate rather than cancel out. If one task takes longer than expected, it's more likely that this will cause subsequent tasks to be delayed, rather than completed more quickly.

This is why simply adding up individual task estimates can lead to an underestimate of the total project duration. Each task has its own uncertainty, and these uncertainties accumulate as tasks are completed.

There is a further mathematical reason.

When we talk about the duration of a task in a project, we're dealing with a certain kind of uncertainty. This uncertainty is often represented as a random variable with a certain mean (average) and variance (a measure of how spread out the values are).

Let's consider a simple project that consists of two tasks, Task A and Task B.

Suppose we estimate that:

- Task A will take 5 days, plus or minus 1 day. This means we believe the duration of Task A follows a normal distribution with a mean of 5 days and a standard deviation of 1 day. The variance (which is the square of the standard deviation) is therefore 1^2 = 1.

- Task B will also take 5 days, plus or minus 2 days. So, the duration of Task B is a random variable with a mean of 5 days and a standard deviation of 2 days. The variance is therefore 2^2 = 4.

Now, we want to estimate the total duration of the project, which is the sum of the durations of Task A and Task B.

The key point here is that when we add together two random variables, the variances add up. This is a fundamental property of variance, a measure of dispersion in a distribution.

So, the variance of the total project duration is 1 (from Task A) + 4 (from Task B) = 5. To get the standard deviation, we take the square root of the variance, which is sqrt(5) ≈ 2.24 days. Taking the square root introduce a non-linearity.

This means that the total project will take 10 days (5 for Task A + 5 for Task B), plus or minus 2.24 days, not 2 days or 1 day. The uncertainty has increased because we've combined two tasks, each with its own uncertainty.

This is the essence of the aggregation of uncertainty: when we combine tasks, the uncertainties don't just blend together; they accumulate, leading to a larger overall uncertainty in the project duration.

This is why a method like Reference Class Forecasting, which takes into account the distribution of outcomes in similar past projects, can often provide a more accurate forecast than simply adding up individual task estimates.
")

(c/show! *ns*)
