package entries.mappers;

import entries.dto.ImageDTO;
import entries.entities.Image;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ImageMapper {
    @Mapping(source = "belongsToId", target = "belongsTo.entryId")
    Image imageDtoImage(ImageDTO dto);

    @Mapping(source = "belongsTo.entryId", target = "belongsToId")
    ImageDTO imageToImageDto(Image image);
}
