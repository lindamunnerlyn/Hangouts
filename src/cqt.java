// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class cqt
    implements android.os.Parcelable.Creator
{

    cqt()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        return new cqs();
    }

    public Object[] newArray(int i)
    {
        return new cqs[i];
    }
}
