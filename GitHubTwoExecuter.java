class GitHubTwoExecuter {
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