module.exports = {
    parserPreset: {
        parserOpts: {
            headerPattern: /^(\w+): (.+) #\d+$/,
            headerCorrespondence: ["type", "subject", "issue"],
        },
    },
    rules: {
        "type-enum": [
            2,
            "always",
            ["feat", "fix", "docs", "rename", "style", "refactor", "test", "chore"],
        ],
        "type-empty": [2, "never"],
        "scope-empty": [2, "always"],
        "subject-empty": [2, "never"],
        "header-max-length": [2, "always", 100],
        "body-max-line-length": [2, "always", 100],
    },
};
