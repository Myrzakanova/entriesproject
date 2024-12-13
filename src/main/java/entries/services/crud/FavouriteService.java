package entries.services.crud;

import entries.dto.EntryDTO;

import java.util.List;

public interface FavouriteService {
    List<EntryDTO> getUsersFavouriteEntries();

    EntryDTO setFavouriteEntry(Long id);
    EntryDTO deleteFavouriteEntry(Long id);
}
