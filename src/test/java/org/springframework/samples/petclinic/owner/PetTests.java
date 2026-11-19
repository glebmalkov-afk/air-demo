/*
 * Copyright 2012-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.owner;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class PetTests {

	@Test
	void ageIsWholeYearsSinceBirthDate() {
		Pet pet = new Pet();
		pet.setBirthDate(LocalDate.of(2024, 3, 14));
		assertThat(pet.getAge(LocalDate.of(2026, 3, 14))).isEqualTo(2);
		assertThat(pet.getAge(LocalDate.of(2026, 3, 13))).isEqualTo(1);
	}

	@Test
	void ageIsNullWithoutBirthDate() {
		assertThat(new Pet().getAge()).isNull();
	}

	@Test
	void ageIsNeverNegative() {
		Pet pet = new Pet();
		pet.setBirthDate(LocalDate.of(2027, 1, 1));
		assertThat(pet.getAge(LocalDate.of(2026, 1, 1))).isZero();
	}

}
