// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class djw
    implements android.os.Parcelable.Creator
{

    djw()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        return new djv(parcel);
    }

    public Object[] newArray(int i)
    {
        return new djv[i];
    }
}
