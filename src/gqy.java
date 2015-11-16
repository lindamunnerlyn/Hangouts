// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class gqy
    implements android.os.Parcelable.Creator
{

    gqy()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        return new gqx(parcel);
    }

    public Object[] newArray(int i)
    {
        return new gqx[i];
    }
}
