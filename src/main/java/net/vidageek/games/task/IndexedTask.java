package net.vidageek.games.task;

import net.vidageek.games.regex.task.Error;

public final class IndexedTask implements Task {

	private final Task delegate;
	private final int index;

	public IndexedTask(final Task delegate, final int index) {
		this.delegate = delegate;
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	public JudgedTask judge(final String challenge) {
		try {
			return delegate.judge(challenge);
		} catch (Exception e) {
			return new Error(e);
		}
	}

	public String getDescription() {
		return delegate.getDescription();
	}

	public String getChallenge() {
		return delegate.getChallenge();
	}

	@Override
	public String toString() {
		return delegate.toString();
	}
}