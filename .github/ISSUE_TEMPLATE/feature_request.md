---
name: Feature request
about: Suggest a new problem or improvement
title: "[FEATURE]"
labels: enhancement
assignees: AGfinx

---

- type: markdown
    attributes:
      value: |
        Have an idea to improve the repository? We'd love to hear it!

  - type: input
    id: topic
    attributes:
      label: Topic Area
      description: Which topic does this belong to?
      placeholder: e.g., Graph, DP, Arrays
    validations:
      required: true

  - type: textarea
    id: description
    attributes:
      label: Describe the Feature
      description: Explain the problem or enhancement clearly.
    validations:
      required: true

  - type: textarea
    id: benefits
    attributes:
      label: Why is this useful?
      description: Explain how it helps learners or improves the repo.
