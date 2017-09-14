package org.fasttrackit.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(
        plugin = {"json:target/json-reports/products-sorting.json"},
        glue = {"org.fasttrackit"},
        features = {"src/test/resources/product-sorting.feature"}
)
@RunWith(Cucumber.class)
public class ProductSortingRunner {
}
