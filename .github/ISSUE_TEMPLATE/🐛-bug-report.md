---
name: "\U0001F41B Bug Report"
about: Report a problem in the code
title: "[BUG]"
labels: bug
assignees: AGfinx

---

name: "🐛 Bug Report"
description: Report a problem in the code
title: "[BUG]: "
labels: ["bug"]
assignees: []

body:
  - type: markdown
    attributes:
      value: |
        Thanks for reporting a bug! Please fill out the details below.

  - type: input
    id: file
    attributes:
      label: File Name
      description: Which Java file has the issue?
      placeholder: e.g., BinarySearch.java
    validations:
      required: true

  - type: textarea
    id: description
    attributes:
      label: Describe the Bug
      description: A clear description of what is wrong.
    validations:
      required: true

  - type: textarea
    id: steps
    attributes:
      label: Steps to Reproduce
      description: Step-by-step instructions to reproduce the issue.
      placeholder: |
        1. Run the program
        2. Enter input...
        3. Observe error
    validations:
      required: true

  - type: textarea
    id: expected
    attributes:
      label: Expected Behavior
      description: What should have happened?

  - type: dropdown
    id: severity
    attributes:
      label: Severity
      options:
        - Low
        - Medium
        - High
