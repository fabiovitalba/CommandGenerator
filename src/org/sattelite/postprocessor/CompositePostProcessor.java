package org.sattelite.postprocessor;

public class CompositePostProcessor implements PostProcessor {

    private PostProcessor first;
    private PostProcessor second;

    public CompositePostProcessor(PostProcessor first, PostProcessor second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public byte[] postProcess(byte[] bytes) throws Exception {
        byte[] firstResultBytes = first.postProcess(bytes);
        return second.postProcess(firstResultBytes);
    }
}
