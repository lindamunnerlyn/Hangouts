// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;

public final class flq
    implements android.os.Parcelable.Creator
{

    public flq()
    {
    }

    public static Tile a(Parcel parcel)
    {
        int k = 0;
        int l = g.a(parcel);
        byte abyte0[] = null;
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    g.b(parcel, i1);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, i1);
                    break;

                case 2: // '\002'
                    j = g.e(parcel, i1);
                    break;

                case 3: // '\003'
                    k = g.e(parcel, i1);
                    break;

                case 4: // '\004'
                    abyte0 = g.l(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new Tile(i, j, k, abyte0);
            }
        } while (true);
    }

    public static void a(Tile tile, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, tile.a());
        g.b(parcel, 2, tile.a);
        g.b(parcel, 3, tile.b);
        g.a(parcel, 4, tile.c);
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new Tile[i];
    }
}
