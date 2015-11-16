// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class atv extends ato
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new atw();
    public fik e;

    public atv()
    {
    }

    atv(Parcel parcel)
    {
        super.b(parcel);
        parcel = (bzk)parcel.readParcelable(bzk.getClassLoader());
        n.b(parcel, "Null place not allowed!");
        if (parcel == null)
        {
            parcel = null;
        } else
        {
            parcel = parcel.a();
        }
        e = parcel;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.b(e, "Location can not be null!");
        super.a(parcel);
        parcel.writeParcelable(bzk.a(e), 0);
    }

}
