// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class cil
    implements android.os.Parcelable.Creator
{

    cil()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        return new cik(parcel.readInt(), parcel.readInt(), parcel.readBundle());
    }

    public Object[] newArray(int i)
    {
        return new cik[i];
    }
}
