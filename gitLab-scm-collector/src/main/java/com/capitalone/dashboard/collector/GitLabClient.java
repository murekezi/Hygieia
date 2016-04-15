
package com.capitalone.dashboard.collector;

import com.capitalone.dashboard.model.Commit;
import com.capitalone.dashboard.model.GitLabRepo;
import java.util.List;

public interface GitLabClient {
    
    List<Commit> getCommits(GitLabRepo repo, boolean firstRun);
}
