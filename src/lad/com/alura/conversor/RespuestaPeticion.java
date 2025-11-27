package lad.com.alura.conversor;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public record RespuestaPeticion(@SerializedName("base_code") String baseCode, @SerializedName("conversion_rates") Map<String,Double> conversionRates) {
}
