class GitHubThreeExecuter {
    public static void main(String[] args) {
        Repository repo = new Repository();
        repo.repoId = 103;
        repo.repoName = "DataScience";
        repo.language = "Python";

        GitHub git = new GitHub(3, "bob789", "bob@example.com", repo);
        git.getGitHubDetails();
    }
}