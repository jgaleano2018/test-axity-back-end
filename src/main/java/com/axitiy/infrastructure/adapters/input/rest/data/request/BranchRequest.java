package com.axitiy.infrastructure.adapters.input.rest.data.request;

import jakarta.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BranchRequest {
    
	@NotEmpty(message = "Branch Code may not be empty")
	private String scodsucax;

	@NotEmpty(message = "Branch may not be empty")
    private String snomsucax;

}
