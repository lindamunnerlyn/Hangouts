// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaLink;

public final class fln
    implements android.os.Parcelable.Creator
{

    public fln()
    {
    }

    public static void a(StreetViewPanoramaLink streetviewpanoramalink, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, streetviewpanoramalink.a());
        g.a(parcel, 2, streetviewpanoramalink.a);
        g.a(parcel, 3, streetviewpanoramalink.b);
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        int j = g.a(parcel);
        int i = 0;
        String s = null;
        float f = 0.0F;
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
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    s = g.i(parcel, k);
                    break;

                case 3: // '\003'
                    f = g.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaLink(i, s, f);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new StreetViewPanoramaLink[i];
    }
}
