package entries.mappers;


import entries.dto.EntryDTO;
import entries.entities.Entry;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EntryMapper {

    @Mapping(source = "createdById", target = "createdBy.id")
    Entry entryDtoToEntry(EntryDTO dto);

    @Mapping(source = "createdBy.id", target = "createdById")
    EntryDTO entryToEntryDto(Entry entry);
}
