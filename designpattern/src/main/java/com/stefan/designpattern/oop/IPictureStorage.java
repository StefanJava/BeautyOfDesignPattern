package com.stefan.designpattern.oop;

import com.stefan.designpattern.oop.entity.Image;
import com.stefan.designpattern.oop.entity.Picture;
import com.stefan.designpattern.oop.entity.PictureMetaInfo;

public interface IPictureStorage {
    void savePicture(Picture picture);
    Image getPicture(String pictureId);
    void deletePicture(String pictureId);
    void modifyMetaInfo(String pictureId, PictureMetaInfo metaInfo);
}
