package com.narga.salon_nails.service;

import java.util.List;


import com.narga.salon_nails.entity.Entry;


public interface IEntryService {
		List<Entry> getNewestEntry();
		
		List<Entry> getIntroduction();
}
