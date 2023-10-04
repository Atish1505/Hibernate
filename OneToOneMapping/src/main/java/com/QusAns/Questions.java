package com.QusAns;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Questions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionId;
	private String question;
	@OneToOne
	@JoinColumn(name = "a_id")
	private Answers answerId;
	
	
	public Questions() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", question=" + question + ", answerId=" + answerId + "]";
	}



	public Questions(int questionId, String question, Answers answerId) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answerId = answerId;
	}

	

	public Answers getAnswerId() {
		return answerId;
	}



	public void setAnswerId(Answers answerId) {
		this.answerId = answerId;
	}



	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	

}
