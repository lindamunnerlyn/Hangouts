// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.location.places.internal.PlaceLocalization;

public final class ffq
    implements android.os.Parcelable.Creator
{

    public ffq()
    {
    }

    public static void a(PlaceLocalization placelocalization, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.a(parcel, 1, placelocalization.b);
        g.b(parcel, 1000, placelocalization.a);
        g.a(parcel, 2, placelocalization.c);
        g.a(parcel, 3, placelocalization.d);
        g.a(parcel, 4, placelocalization.e);
        g.b(parcel, 5, placelocalization.f);
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = g.a(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    g.b(parcel, k);
                    break;

                case 1: // '\001'
                    s3 = g.i(parcel, k);
                    break;

                case 1000: 
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = g.i(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = g.i(parcel, k);
                    break;

                case 4: // '\004'
                    s = g.i(parcel, k);
                    break;

                case 5: // '\005'
                    arraylist = g.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PlaceLocalization(i, s3, s2, s1, s, arraylist);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new PlaceLocalization[i];
    }
}
