package com.stefan.designpattern.oop.impl;

import com.stefan.designpattern.oop.entity.Image;
import com.stefan.designpattern.oop.entity.Picture;
import com.stefan.designpattern.oop.entity.PictureMetaInfo;
import com.stefan.designpattern.oop.IPictureStorage;

public class PictureStorage implements IPictureStorage {
    @Override
    public void savePicture(Picture picture) {

    }

    @Override
    public Image getPicture(String pictureId) {
        return null;
    }

    @Override
    public void deletePicture(String pictureId) {

    }

    @Override
    public void modifyMetaInfo(String pictureId, PictureMetaInfo metaInfo) {

    }
}
