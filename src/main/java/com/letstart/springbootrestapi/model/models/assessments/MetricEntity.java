package com.letstart.springbootrestapi.model.models.assessments;

import com.fasterxml.jackson.annotation.JsonView;
import com.letstart.springbootrestapi.payAm.core.model.BaseEntity;
import com.letstart.springbootrestapi.constants.assessments.MetricConstants;
import com.letstart.springbootrestapi.dtos.assessments.MetricView;
import com.letstart.springbootrestapi.dtos.assessments.QuestionHasSalView;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "metric")
@EntityListeners({AuditingEntityListener.class})
public class MetricEntity extends BaseEntity implements MetricConstants {
	private static final long serialVersionUID = 1L;

	@JsonView({MetricView.class, QuestionHasSalView.class})
	@Lob
	public String text;

	@JsonView({MetricView.class, QuestionHasSalView.class})
	public Integer priority;

	@JsonView({MetricView.class, QuestionHasSalView.class})
	public Float weight;

	@JsonView
	@OneToMany(mappedBy = "metric")
	public List<QuestionHasSalEntity> questionHasSals;
}