// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class cjr
    implements android.os.Parcelable.Creator
{

    cjr()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        return new cjq(parcel.readInt(), parcel.readInt(), parcel.readBundle());
    }

    public Object[] newArray(int i)
    {
        return new cjq[i];
    }
}
