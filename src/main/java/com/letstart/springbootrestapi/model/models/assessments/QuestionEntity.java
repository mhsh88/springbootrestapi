package com.letstart.springbootrestapi.model.models.assessments;

import com.fasterxml.jackson.annotation.JsonView;
import com.letstart.springbootrestapi.payAm.core.model.BaseEntity;
import com.letstart.springbootrestapi.constants.assessments.QuestionConstants;
import com.letstart.springbootrestapi.dtos.assessments.QuestionHasSalView;
import com.letstart.springbootrestapi.dtos.assessments.QuestionView;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "question")
@EntityListeners({AuditingEntityListener.class})
public class QuestionEntity extends BaseEntity implements QuestionConstants {
	private static final long serialVersionUID = 1L;

	@JsonView
	@OneToMany(mappedBy = "question")
	public List<QuestionHasSalEntity> questionHasSals;

	@JsonView
	@ManyToMany
	@JoinTable(
			name="question_has_scope",
			joinColumns={@JoinColumn(name="question_id", nullable=false)},
			inverseJoinColumns={@JoinColumn(name="scope_id", nullable=false)}
	)
	public List<QuestionScopeEntity> questionScopes;

	@JsonView({QuestionView.class, QuestionHasSalView.class})
	@Lob
	public String text;

	@JsonView
	@OneToMany(mappedBy = "question")
	public List<QuestionAnswerEntity> questionAnswers;
}