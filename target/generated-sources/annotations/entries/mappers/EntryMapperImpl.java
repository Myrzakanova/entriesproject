package entries.mappers;

import entries.dto.EntryDTO;
import entries.entities.Entry;
import entries.entities.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-13T17:42:10+0600",
    comments = "version: 1.6.2, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class EntryMapperImpl implements EntryMapper {

    @Override
    public Entry entryDtoToEntry(EntryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Entry.EntryBuilder entry = Entry.builder();

        entry.createdBy( entryDTOToUser( dto ) );
        entry.entryId( dto.getEntryId() );
        entry.name( dto.getName() );
        entry.content( dto.getContent() );
        entry.latitude( dto.getLatitude() );
        entry.longitude( dto.getLongitude() );
        entry.createdAt( dto.getCreatedAt() );
        entry.updatedAt( dto.getUpdatedAt() );

        return entry.build();
    }

    @Override
    public EntryDTO entryToEntryDto(Entry entry) {
        if ( entry == null ) {
            return null;
        }

        EntryDTO.EntryDTOBuilder entryDTO = EntryDTO.builder();

        entryDTO.createdById( entryCreatedById( entry ) );
        entryDTO.entryId( entry.getEntryId() );
        entryDTO.name( entry.getName() );
        entryDTO.content( entry.getContent() );
        entryDTO.latitude( entry.getLatitude() );
        entryDTO.longitude( entry.getLongitude() );
        entryDTO.createdAt( entry.getCreatedAt() );
        entryDTO.updatedAt( entry.getUpdatedAt() );

        return entryDTO.build();
    }

    protected User entryDTOToUser(EntryDTO entryDTO) {
        if ( entryDTO == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( entryDTO.getCreatedById() );

        return user.build();
    }

    private Long entryCreatedById(Entry entry) {
        User createdBy = entry.getCreatedBy();
        if ( createdBy == null ) {
            return null;
        }
        return createdBy.getId();
    }
}
