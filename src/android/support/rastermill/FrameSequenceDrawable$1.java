// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.rastermill;

import android.graphics.Bitmap;

final class tmapProvider
    implements tmapProvider
{

    public Bitmap acquireBitmap(int i, int j)
    {
        return Bitmap.createBitmap(i, j, android.graphics.rawable._fld1);
    }

    public void releaseBitmap(Bitmap bitmap)
    {
        bitmap.recycle();
    }

    tmapProvider()
    {
    }
}
