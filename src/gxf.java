// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class gxf
    implements android.os.Parcelable.Creator
{

    gxf()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        return new gxe(parcel);
    }

    public Object[] newArray(int i)
    {
        return new gxe[i];
    }
}
