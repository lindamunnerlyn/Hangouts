// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class hbu
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new hbv();
    private final List a;

    hbu(Parcel parcel)
    {
        a = parcel.createStringArrayList();
    }

    public hbu(List list)
    {
        a = list;
    }

    List a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStringList(a);
    }

}
