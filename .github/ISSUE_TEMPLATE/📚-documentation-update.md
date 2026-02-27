---
name: "\U0001F4DA Documentation Update"
about: Improve README, comments, or documentation
title: "[DOCS]"
labels: documentation
assignees: AGfinx

---

- type: markdown
    attributes:
      value: |
        Help us improve the documentation!

  - type: textarea
    id: section
    attributes:
      label: Section to Update
      description: Which file or section needs improvement?
      placeholder: README.md / CONTRIBUTING.md / specific class
    validations:
      required: true

  - type: text area
    id: suggestion
    attributes:
      label: Suggested Changes
      description: Describe the improvement clearly.
    validations:
      required: true
