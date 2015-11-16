// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class drm
    implements android.os.Parcelable.Creator
{

    drm()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        drl drl1 = new drl();
        drl1.a = parcel.readString();
        drl1.b = parcel.readString();
        drl1.c = parcel.readInt();
        drl1.d = parcel.readInt();
        return drl1;
    }

    public Object[] newArray(int i)
    {
        return new drl[i];
    }
}
