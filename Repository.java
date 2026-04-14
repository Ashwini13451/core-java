class Repository {
    int repoId;
    String repoName;
    String language;

    public void getRepositoryDetails() {
        System.out.println("getRepositoryDetails invoked");
        System.out.println("the repository id is: " + repoId);
        System.out.println("the repository name is: " + repoName);
        System.out.println("the repository language is: " + language);
        System.out.println("getRepositoryDetails ended");
    }
}

class GitHub {
    int githubId;
    String username;
    String email;
    Repository repository;

    public void getGitHubDetails() {
        System.out.println("getGitHubDetails invoked");
        System.out.println("the github id is: " + githubId);
        System.out.println("the username is: " + username);
        System.out.println("the email is: " + email);
        repository.getRepositoryDetails();
        System.out.println("getGitHubDetails ended");
    }

    GitHub(int githubId, String username, String email, Repository repository) {
        this.githubId = githubId;
        this.username = username;
        this.email = email;
        this.repository = repository;
    }

    GitHub() {

    }

    public boolean createRepository(Repository repository) {
        this.repository = repository;
        return true;
    }
}

class GitHubOneExecutor {
    public static void main(String[] args) {
        GitHub git = new GitHub();
        git.githubId = 1;
        git.username = "john123";
        git.email = "john@example.com";

        Repository repo = new Repository();
        repo.repoId = 101;
        repo.repoName = "JavaProject";
        repo.language = "Java";

        git.repository = repo;

        git.getGitHubDetails();
    }
}

class GitHubTwoExecutor {
    public static void main(String[] args) {
        GitHub git = new GitHub();
        git.githubId = 2;
        git.username = "alice456";
        git.email = "alice@example.com";

        Repository repo = new Repository();
        repo.repoId = 102;
        repo.repoName = "WebApp";
        repo.language = "JavaScript";

        boolean created = git.createRepository(repo);
        System.out.println(created);

        git.getGitHubDetails();
    }
}

class GitHubThreeExecutor {
    public static void main(String[] args) {
        Repository repo = new Repository();
        repo.repoId = 103;
        repo.repoName = "DataScience";
        repo.language = "Python";

        GitHub git = new GitHub(3, "bob789", "bob@example.com", repo);
        git.getGitHubDetails();
    }
}