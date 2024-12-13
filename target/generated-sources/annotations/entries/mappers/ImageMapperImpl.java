package entries.mappers;

import entries.dto.ImageDTO;
import entries.entities.Entry;
import entries.entities.Image;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-13T17:42:10+0600",
    comments = "version: 1.6.2, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class ImageMapperImpl implements ImageMapper {

    @Override
    public Image imageDtoImage(ImageDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Image.ImageBuilder image = Image.builder();

        image.belongsTo( imageDTOToEntry( dto ) );
        image.imageId( dto.getImageId() );
        image.imageUrl( dto.getImageUrl() );
        image.createdAt( dto.getCreatedAt() );

        return image.build();
    }

    @Override
    public ImageDTO imageToImageDto(Image image) {
        if ( image == null ) {
            return null;
        }

        ImageDTO.ImageDTOBuilder imageDTO = ImageDTO.builder();

        imageDTO.belongsToId( imageBelongsToEntryId( image ) );
        imageDTO.imageId( image.getImageId() );
        imageDTO.imageUrl( image.getImageUrl() );
        imageDTO.createdAt( image.getCreatedAt() );

        return imageDTO.build();
    }

    protected Entry imageDTOToEntry(ImageDTO imageDTO) {
        if ( imageDTO == null ) {
            return null;
        }

        Entry.EntryBuilder entry = Entry.builder();

        entry.entryId( imageDTO.getBelongsToId() );

        return entry.build();
    }

    private Long imageBelongsToEntryId(Image image) {
        Entry belongsTo = image.getBelongsTo();
        if ( belongsTo == null ) {
            return null;
        }
        return belongsTo.getEntryId();
    }
}
