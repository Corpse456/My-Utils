package workWithText;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Counter {

	public static void main(String[] args) {
		List<String> string1 = Arrays.asList("CHECK_IMAGE_MATCH","COPY_PROPERTY_DATA","FETCH_DESCRIPTION_FROM_SITE","FILL_SITE_PROPERTY_URL","MANUAL_AUDIT_RESULTS_REVIEW","MANUAL_CHECK_IMAGES","MAP_HOTEL_AMENITY","SITE_NOTIFICATION_EMAIL_REVIEW","ADDRESS","EMAIL","FAX","HOME_PAGE","NAME","PHONE","DOWNLOAD_ONE_IMAGE","CHECK_DESCRIPTION","CHECK_IMAGE_UNIQUENESS","COLLECT_ORPHAN_IMAGES","DOWNLOAD_IMAGES","STAR_RATING","MAP_PROPERTY_STAR_RATING","MARK_DUPLICATE_IMAGES","SEND_GENERATED_EMAIL","CATEGORY","MAP_PROPERTY_CATEGORY","GEO_COORDINATES","UNIQUE_IMAGES_VALIDITY","RETRIEVE_HOTEL_ID","HOTEL_SEARCHES","SEARCH_BY_NAME","CHECK_MISSING_IMPORTANT_AMENITIES","CHECK_APPROVED_AMENITIES","CHECK_IMPORTANT_AMENITIES","SEARCH_MISSING_IMPORTANT_AMENITIES","SEARCH_APPROVED_AMENITIES","CHECK_FREE_TEXT_CHARACTERISTICS");
		List<String> string2 = Arrays.asList("CHECK_IMAGE_MATCH","COPY_PROPERTY_DATA","FETCH_DESCRIPTION_FROM_SITE","FILL_SITE_PROPERTY_URL","MANUAL_AUDIT_RESULTS_REVIEW","MANUAL_CHECK_IMAGES","MAP_HOTEL_AMENITY","SITE_NOTIFICATION_EMAIL_REVIEW","ADDRESS","EMAIL","FAX","HOME_PAGE","NAME","PHONE","DOWNLOAD_ONE_IMAGE","CHECK_DESCRIPTION","CHECK_IMAGE_UNIQUENESS","COLLECT_ORPHAN_IMAGES","DOWNLOAD_IMAGES","STAR_RATING","MAP_PROPERTY_STAR_RATING","MARK_DUPLICATE_IMAGES","SEND_GENERATED_EMAIL","CATEGORY","MAP_PROPERTY_CATEGORY","GEO_COORDINATES","UNIQUE_IMAGES_VALIDITY","RETRIEVE_HOTEL_ID","HOTEL_SEARCHES","SEARCH_BY_NAME","CHECK_MISSING_IMPORTANT_AMENITIES","CHECK_APPROVED_AMENITIES","CHECK_IMPORTANT_AMENITIES","SEARCH_MISSING_IMPORTANT_AMENITIES","SEARCH_APPROVED_AMENITIES","CHECK_FREE_TEXT_CHARACTERISTICS");
		List<String> string3 = Arrays.asList("CHECK_IMAGE_MATCH","COPY_PROPERTY_DATA","FETCH_DESCRIPTION_FROM_SITE","FILL_SITE_PROPERTY_URL","MANUAL_AUDIT_RESULTS_REVIEW","MANUAL_CHECK_IMAGES","MAP_HOTEL_AMENITY","SITE_NOTIFICATION_EMAIL_REVIEW","ADDRESS","EMAIL","FAX","HOME_PAGE","NAME","PHONE","DOWNLOAD_ONE_IMAGE","CHECK_DESCRIPTION","CHECK_IMAGE_UNIQUENESS","COLLECT_ORPHAN_IMAGES","DOWNLOAD_IMAGES","STAR_RATING","MAP_PROPERTY_STAR_RATING","MARK_DUPLICATE_IMAGES","SEND_GENERATED_EMAIL","CATEGORY","MAP_PROPERTY_CATEGORY","GEO_COORDINATES","UNIQUE_IMAGES_VALIDITY","RETRIEVE_HOTEL_ID","HOTEL_SEARCHES","SEARCH_BY_NAME","CHECK_MISSING_IMPORTANT_AMENITIES","CHECK_APPROVED_AMENITIES","CHECK_IMPORTANT_AMENITIES");
		List<String> string4 = Arrays.asList("ADDRESS","CATEGORY","COPY_PROPERTY_DATA","CHECK_DESCRIPTION","CHECK_IMAGE_MATCH","CHECK_IMAGE_UNIQUENESS","COLLECT_ORPHAN_IMAGES","DOWNLOAD_IMAGES","DOWNLOAD_ONE_IMAGE","EMAIL","FAX","FETCH_DESCRIPTION_FROM_SITE","FILL_SITE_PROPERTY_URL","GEO_COORDINATES","HOME_PAGE","HOTEL_SEARCHES","MANUAL_AUDIT_RESULTS_REVIEW","MANUAL_CHECK_IMAGES","MAP_HOTEL_AMENITY","MAP_PROPERTY_CATEGORY","MAP_PROPERTY_STAR_RATING","MARK_DUPLICATE_IMAGES","NAME","PHONE","RETRIEVE_HOTEL_ID","SEARCH_BY_NAME","SEND_GENERATED_EMAIL","SITE_NOTIFICATION_EMAIL_REVIEW","CHECK_MISSING_IMPORTANT_AMENITIES","CHECK_APPROVED_AMENITIES","CHECK_IMPORTANT_AMENITIES","STAR_RATING","SEARCH_MISSING_IMPORTANT_AMENITIES","SEARCH_APPROVED_AMENITIES","CHECK_FREE_TEXT_CHARACTERISTICS","UNIQUE_IMAGES_VALIDITY");
		
		count(string1);
		count(string2);
		count(string3);
		count(string4);
	}

	private static void count(List<String> string) {
		Collections.sort(string);
		System.out.print(string.size() + ": ");
		System.out.println(string);
	}
}
