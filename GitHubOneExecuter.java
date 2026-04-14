class GitHubOneExecuter {
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