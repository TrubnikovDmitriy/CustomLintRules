package custom.lint.rules

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.CURRENT_API
import com.android.tools.lint.detector.api.Issue

@Suppress("unused", "UnstableApiUsage")
class CustomIssueRegistry : IssueRegistry() {
    override val api = CURRENT_API

    override val issues: List<Issue> = listOf(
        ActivityResultDetector.ISSUE
    )
}
