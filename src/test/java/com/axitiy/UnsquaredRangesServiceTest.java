package com.axitiy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

import com.axitiy.domain.model.Conciliation;
import com.axitiy.domain.model.UnsquaredRanges;
import com.axitiy.domain.service.BranchProductService;
import com.axitiy.domain.service.ConciliationService;
import com.axitiy.domain.service.UnsquaredRangesService;
import com.axitiy.infrastructure.adapters.output.persistence.entity.BranchProductEntity;
import com.axitiy.infrastructure.adapters.output.persistence.entity.ConciliationEntity;
import com.axitiy.infrastructure.adapters.output.persistence.entity.UnsquaredRangesEntity;
import com.axitiy.infrastructure.adapters.output.persistence.mapper.BranchProductMapper;
import com.axitiy.infrastructure.adapters.output.persistence.mapper.ConciliationMapper;
import com.axitiy.infrastructure.adapters.output.persistence.mapper.UnsquaredRangesMapper;
import com.axitiy.infrastructure.adapters.output.persistence.repository.BranchProductRepository;
import com.axitiy.infrastructure.adapters.output.persistence.repository.ConciliationRepository;
import com.axitiy.infrastructure.adapters.output.persistence.repository.UnsquaredRangesRepository;

@SpringBootTest
public class UnsquaredRangesServiceTest {

	@Mock
    private ConciliationRepository conciliationRepository;
	
	private UnsquaredRangesRepository unsquaredRangesRepository;
	
	private BranchProductRepository branchProductRepository;
	

    @InjectMocks
    private ConciliationService conciliationService;
    
    private UnsquaredRangesService unsquaredRangesService;
    
    private BranchProductService branchProductService;
	
    
    
    private Conciliation conciliation;
    
    private ConciliationEntity conciliationEntity;
    
    private UnsquaredRangesEntity unsquaredRangesEntity;
    
    private BranchProductEntity branchProductEntity;
    
    private List<ConciliationEntity> conciliationEntityList;
    
    private String monthConciliationRequest;
    
    private String yearConciliationRequest;
    
    private ConciliationMapper conciliationMapper;
    
    private UnsquaredRangesMapper unsquaredRangesMapper;
    
    private BranchProductMapper branchProductMapper;
    
    

    @BeforeEach
    public void setup(){
        //employeeRepository = Mockito.mock(EmployeeRepository.class);
        //employeeService = new EmployeeServiceImpl(employeeRepository);
    	
    	
    	//ConciliationEntity(Date afearax, int asidsucax, int apidprax, int adiddoax, double adifax, double asfarax, String aresax)
    	//UnsquaredRangesEntity(String danoax, String dmesax, String dconax, int dsidsucax, int dpidprax, int ddiddoax, Date dfearax, Double ddifax, Double dsfarax, String dresax) {
    	
    	
    	this.monthConciliationRequest = "01";    	
    	this.yearConciliationRequest = "2025";    	
    	Date dateConciliationTest = new Date();
    	
    	ConciliationEntity conciliationEntity = new ConciliationEntity(dateConciliationTest, 1, 1, 1, 0.00, 3081673400.00, "C");
    	
    	this.conciliationEntityList = new ArrayList<ConciliationEntity>();
    	
    	conciliationEntityList.add(conciliationEntity);
    	
    	conciliationEntity = new ConciliationEntity(dateConciliationTest, 1, 2, 1, 0.00, 691624500.00, "C");
    	
    	conciliationEntityList.add(conciliationEntity);
    	
    	conciliationEntity = new ConciliationEntity(dateConciliationTest, 1, 3, 1, 19.50, 2976795600.00, "D");
    	
    	conciliationEntityList.add(conciliationEntity);

    	conciliationEntity = new ConciliationEntity(dateConciliationTest, 2, 1, 1, 55.00, 422793679, "B");
    	
    	conciliationEntityList.add(conciliationEntity);
    	
    	
    	// Get day from date
    	LocalDate currentDate = LocalDate.now();
	    int dayActually = currentDate.getDayOfMonth();
    	String dayActuallyStr = Integer.toString(dayActually).length() == 1 ? '0'+Integer.toString(dayActually) : Integer.toString(dayActually);
    	
    	
        this.unsquaredRangesEntity = new UnsquaredRangesEntity(yearConciliationRequest, monthConciliationRequest, dayActuallyStr, 1, 3, 1, dateConciliationTest, 19.50, 2976795600.00, "D");
        
        this.unsquaredRangesEntity.setId_Conciliation(1);
        
        this.branchProductEntity = new BranchProductEntity(1, 1, 1);

    }

    // JUnit test for saveConciliation method
    @DisplayName("JUnit test for conciliation method")
    @Test
    public void givenConcliliationObject_whenSaveConciliation_thenReturnConciliationObject(){
        // given - precondition or setup
        /*given(employeeRepository.findByEmail(employee.getEmail()))
                .willReturn(Optional.empty());*/
    	
    	List<Conciliation> listConciliation = conciliationMapper.toListConciliation(conciliationEntityList);

        given(conciliationRepository.save(conciliationEntityList.get(0))).willReturn(conciliationEntity);
        
        given(conciliationService.createConciliation(listConciliation.get(0))).willReturn(conciliation);

        //System.out.println(employeeRepository);
        //System.out.println(employeeService);

        // when -  action or the behaviour that we are going test
        //Employee savedEmployee = employeeService.saveEmployee(employee);
        Conciliation conciliation2 = conciliationMapper.toConciliation(conciliationEntity);

        //System.out.println(savedEmployee);
        // then - verify the output
        assertThat(conciliation).isNotNull();
        assertThat(conciliation2).isNotNull();
        assertEquals(conciliation, conciliation2);
    }
    
    // JUnit test for saveUnsquaredRanges method
    @DisplayName("JUnit test for unsquared ranges method")
    @Test
    public void givenUnsquaredRangesObject_whenSaveUnsquaredRanges_thenReturnUnsquaredRangesObject(){
    	
    	
        UnsquaredRanges unsquaredRanges = unsquaredRangesMapper.toUnsquaredRanges(unsquaredRangesEntity);
    	
        given(unsquaredRangesRepository.save(this.unsquaredRangesEntity)).willReturn(this.unsquaredRangesEntity);
        
        given(unsquaredRangesService.createUnsquaredRanges(unsquaredRanges)).willReturn(unsquaredRanges);

        // when -  action or the behaviour that we are going test
        UnsquaredRanges unsquaredRanges2 = unsquaredRangesMapper.toUnsquaredRanges(this.unsquaredRangesEntity);

        // then - verify the output
        assertThat(unsquaredRanges).isNotNull();
        assertThat(unsquaredRanges2).isNotNull();
        assertEquals(unsquaredRanges, unsquaredRanges2);
    }
    
    
    // JUnit test for saveBranchProduct method
    @DisplayName("JUnit test for branch product method")
    @Test
    public void givenBranchProductObject_whenSaveBranchProduct_thenReturnBranchProductObject(){
    	
    	
    	com.axitiy.domain.model.BranchProduct branchProduct = branchProductMapper.toBranchProduct(branchProductEntity);
    	
        given(branchProductRepository.save(this.branchProductEntity)).willReturn(this.branchProductEntity);
        
        given(branchProductService.createBranchProduct(branchProduct)).willReturn(branchProduct);

        // when -  action or the behaviour that we are going test
        com.axitiy.domain.model.BranchProduct branchProduct2 = branchProductMapper.toBranchProduct(this.branchProductEntity);

        // then - verify the output
        assertThat(branchProduct).isNotNull();
        assertThat(branchProduct2).isNotNull();
        assertEquals(branchProduct, branchProduct2);
    }
    
    
    
    // JUnit test for getUnsquaredRanges method
    @DisplayName("JUnit test for getUnsquaredRanges method")
    @Test
    public void givenUnsquaredRangesList_whenGetAllUnsquaredRanges_thenReturnUnsquaredRangesList(){
        // given - precondition or setup

        this.monthConciliationRequest = "01";    	
    	this.yearConciliationRequest = "2025";    	
    	Date dateConciliationTest = new Date();
    	
    	// Get day from date
    	LocalDate currentDate = LocalDate.now();
	    int dayActually = currentDate.getDayOfMonth();
    	String dayActuallyStr = Integer.toString(dayActually).length() == 1 ? '0'+Integer.toString(dayActually) : Integer.toString(dayActually);
    	
    	UnsquaredRangesEntity unsquaredRangesEntity2 = new UnsquaredRangesEntity(yearConciliationRequest, monthConciliationRequest, dayActuallyStr, 1, 3, 1, dateConciliationTest, 19.50, 2976795600.00, "D");
        
        unsquaredRangesEntity2.setId_Conciliation(2);
        
        given(unsquaredRangesRepository.findAll()).willReturn(List.of(unsquaredRangesEntity,unsquaredRangesEntity2));
        
        

        // when -  action or the behaviour that we are going test
        List<UnsquaredRanges> unsquaredRangesList = this.unsquaredRangesService.getUnsquaredRangesByFilters(dateConciliationTest, 1, 1);

        // then - verify the output
        assertThat(unsquaredRangesList).isNotNull();
        assertThat(unsquaredRangesList.size()).isEqualTo(2);
    }



}
