package com.psiphon4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import java.util.List;

import ca.psiphon.PsiphonTunnel;

//nowos2050@gmail.com
// psiphon inc
public class psiphon extends WindowProperties implements PsiphonTunnel.HostService{
    @Override
    public void createAndAttachView(int id, FrameLayout frame) {
        super.createAndAttachView(id, frame);
        LayoutInflater inflater=(LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.main,frame,true);
    }

    @Override
    public Context getContext() {
        return null;
    }

    @Override
    public String getPsiphonConfig() {
        return null;
    }

    @Override
    public Object getVpnService() {
        return null;
    }

    @Override
    public Object newVpnServiceBuilder() {
        return null;
    }

    @Override
    public void onDiagnosticMessage(String s) {

    }

    @Override
    public void onAvailableEgressRegions(List<String> list) {

    }

    @Override
    public void onSocksProxyPortInUse(int i) {

    }

    @Override
    public void onHttpProxyPortInUse(int i) {

    }

    @Override
    public void onListeningSocksProxyPort(int i) {

    }

    @Override
    public void onListeningHttpProxyPort(int i) {

    }

    @Override
    public void onUpstreamProxyError(String s) {

    }

    @Override
    public void onConnecting() {

    }

    @Override
    public void onConnected() {

    }

    @Override
    public void onHomepage(String s) {

    }

    @Override
    public void onClientRegion(String s) {

    }

    @Override
    public void onClientUpgradeDownloaded(String s) {

    }

    @Override
    public void onClientIsLatestVersion() {

    }

    @Override
    public void onSplitTunnelRegion(String s) {

    }

    @Override
    public void onUntunneledAddress(String s) {

    }

    @Override
    public void onBytesTransferred(long l, long l1) {

    }

    @Override
    public void onStartedWaitingForNetworkConnectivity() {

    }

    @Override
    public void onStoppedWaitingForNetworkConnectivity() {

    }

    @Override
    public void onActiveAuthorizationIDs(List<String> list) {

    }

    @Override
    public void onTrafficRateLimits(long l, long l1) {

    }

    @Override
    public void onApplicationParameter(String s, Object o) {

    }

    @Override
    public void onServerAlert(String s, String s1) {

    }

    @Override
    public void onExiting() {

    }
}
