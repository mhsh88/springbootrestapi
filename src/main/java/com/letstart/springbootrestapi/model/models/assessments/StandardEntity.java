package com.letstart.springbootrestapi.model.models.assessments;

import com.fasterxml.jackson.annotation.JsonView;
import com.letstart.springbootrestapi.payAm.core.model.BaseEntity;
import com.letstart.springbootrestapi.constants.assessments.StandardConstants;
import com.letstart.springbootrestapi.dtos.assessments.QuestionHasSalView;
import com.letstart.springbootrestapi.dtos.assessments.StandardView;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "standard")
@EntityListeners({AuditingEntityListener.class})
public class StandardEntity extends BaseEntity implements StandardConstants {
	private static final long serialVersionUID = 1L;

	@JsonView({StandardView.class, QuestionHasSalView.class})
	@Lob
	public String text;

	@JsonView
	@ManyToMany(mappedBy = "standards")
	public List<OrganizationAssessmentEntity> organizationAssessments;

	@JsonView
	@OneToMany(mappedBy = "standard")
	public List<QuestionHasSalEntity> questionHasSals;
}